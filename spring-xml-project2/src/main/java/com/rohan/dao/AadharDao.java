package com.rohan.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import com.rohan.pojo.Aadhar;
import com.rohan.util.ConnectionUtil;
import com.rohan.util.IncomeHighToLowComparator;
import com.rohan.util.IncomeLowToHighComparator;

public class AadharDao {
	
	
	
	ConnectionUtil util;
	
	
	
	public ConnectionUtil getUtil() {
		return util;
	}

	public void setUtil(ConnectionUtil util) {
		this.util = util;
	}

	public void saveAadharDao(Aadhar aadhar ) {
		Connection con = null;
		Statement stmt = null;
		try {
			con = util.getConnection();
			stmt = con.createStatement();
			String insertQuery = "insert into aadhar1 values (" + aadhar.getAadharId() + "," + "'" + aadhar.getAadharHolderName() + "'"
					+ "," + aadhar.getAge() + "," + aadhar.getIncome() + "," + aadhar.getMobileNo() + ")";
			stmt.execute(insertQuery);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public Aadhar selectByAadharIdDao(int aadharId) {
		Connection con = null;
		Statement stmt = null;
		Aadhar duplicateaadhar = new Aadhar();
			try {
				con = util.getConnection();
				stmt = con.createStatement();
				String selectQuary="select* from aadhar1 where aadharid=" + aadharId;
				ResultSet rs = stmt.executeQuery(selectQuary);
				while(rs.next()) {
					duplicateaadhar.setAadharId(rs.getInt(1));
					duplicateaadhar.setAadharHolderName(rs.getString(2));
					duplicateaadhar.setAge(rs.getInt(3));
					duplicateaadhar.setIncome(rs.getDouble(4));
					duplicateaadhar.setMobileNo(rs.getLong(5));
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		
		
		return duplicateaadhar;
	}
	
	public List<Aadhar> selectAllAadharsDao(){
		Connection con = null;
		Statement stmt = null;
		List<Aadhar> list1 = new ArrayList<Aadhar>();
			try {
					con = util.getConnection();
					stmt = con.createStatement();
					String Selectquary="select * from aadhar1";
					ResultSet rs = stmt.executeQuery(Selectquary);
					
					while(rs.next()) {
						Aadhar duplicateaadhar = new Aadhar();
						duplicateaadhar.setAadharId(rs.getInt(1));
						duplicateaadhar.setAadharHolderName(rs.getString(2));
						duplicateaadhar.setAge(rs.getInt(3));
						duplicateaadhar.setIncome(rs.getDouble(4));
						duplicateaadhar.setMobileNo(rs.getLong(5));
						list1.add(duplicateaadhar);
					}
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				
		
		
		return list1;
	}
	
	public List<Aadhar> selectAllAdharIncomeLowtoHighDao(){
		List<Aadhar> adharlist2 = selectAllAadharsDao();
		Collections.sort(adharlist2, new IncomeLowToHighComparator());
		return adharlist2;
		
	}
	
	public List<Aadhar> selectAllAdharIncomeHighToLowDao(){
		List<Aadhar> adharlist = selectAllAadharsDao();
		Collections.sort(adharlist, new IncomeHighToLowComparator());
		return adharlist;
		
	}
	
	public void deleteAadharDao(int aadharid) {
		Connection con = null;
		Statement stmt = null;
		
				try {
						con = util.getConnection();
						stmt = con.createStatement();
						String deleteQuery = "delete from aadhar1 where aadharid = " + aadharid;
						stmt.execute(deleteQuery);
						con.close();
					} catch (SQLException e) {
						
						e.printStackTrace();
					}
					
			}
	
	public Aadhar updateAadharDao(Aadhar aadhar) {
		Connection con = null;
		Statement stmt = null;
		
						try {
							con = util.getConnection();
							stmt = con.createStatement();
							String updateAadharQuery = "update aadhar1 set aadharholdername = " + "'" + aadhar.getAadharHolderName() + "',"
									+ "age =" + aadhar.getAge() + " where aadharid = " + aadhar.getAadharId();
							System.out.println(updateAadharQuery);
							stmt.execute(updateAadharQuery);
						} catch (SQLException e) {
							
							e.printStackTrace();
						}
						
		
		return selectByAadharIdDao(aadhar.getAadharId());
	}
	

}

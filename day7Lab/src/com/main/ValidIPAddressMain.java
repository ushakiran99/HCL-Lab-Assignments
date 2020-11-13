package com.main;

import java.util.Scanner;

import com.pojo.ValidIPAddress;

public class ValidIPAddressMain {
	public static void main(String[] args) {
		System.out.println("Enter the IpAddress");
		Scanner scanner = new Scanner(System.in);
		String ipAddress = scanner.next();
		scanner.close();
		boolean b = ValidIPAddress.validateIpvalidator(ipAddress);
		if (b == true)
			System.out.println("Valid IpAddress");
		else
			System.out.println("Invalid IpAddress");
	}

}

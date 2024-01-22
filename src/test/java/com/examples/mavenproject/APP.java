package com.examples.mavenproject;

import java.util.UUID;
import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;

public class APP {
	 public static void main(String[] args) {
	        // Generate a random UUID
	        UUID uuid = UUID.randomUUID();
	        System.out.println("Generated UUID: " + uuid);

	        // Convert UUID to uppercase using Guava
	        String uppercaseUuid = Hashing.sha256().hashString(uuid.toString(), Charsets.UTF_8).toString().toUpperCase();
	        System.out.println("Uppercase UUID: " + uppercaseUuid);
	    }
	}



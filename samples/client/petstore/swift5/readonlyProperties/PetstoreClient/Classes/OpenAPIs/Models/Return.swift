//
// Return.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/** Model for testing reserved words */
public struct Return: Codable { 


    public private(set) var _return: Int?

    public init(_return: Int?) {
        self._return = _return
    }

    public enum CodingKeys: String, CodingKey, CaseIterable { 
        case _return = "return"
    }

}

=begin
#OpenAPI Petstore

#This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.3.0-SNAPSHOT

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for Petstore::HealthCheckResult
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'HealthCheckResult' do
  before do
    # run before each test
    @instance = Petstore::HealthCheckResult.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of HealthCheckResult' do
    it 'should create an instance of HealthCheckResult' do
      expect(@instance).to be_instance_of(Petstore::HealthCheckResult)
    end
  end
  describe 'test attribute "nullable_message"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end

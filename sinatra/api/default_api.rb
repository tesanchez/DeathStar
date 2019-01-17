require 'json'


MyApp.add_route('DELETE', '/SE-Design/HR_Temil/0.0.2/users', {
  "resourcePath" => "/Default",
  "summary" => "",
  "nickname" => "users_delete", 
  "responseClass" => "void", 
  "endpoint" => "/users", 
  "notes" => "delete",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/SE-Design/HR_Temil/0.0.2/users', {
  "resourcePath" => "/Default",
  "summary" => "",
  "nickname" => "users_get", 
  "responseClass" => "inline_response_200", 
  "endpoint" => "/users", 
  "notes" => "Allows users to get employees",
  "parameters" => [
    {
      "name" => "uuid",
      "description" => "UUID number of employee",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "first_name",
      "description" => "Users first name",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "last_name",
      "description" => "Users last name",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/SE-Design/HR_Temil/0.0.2/users', {
  "resourcePath" => "/Default",
  "summary" => "",
  "nickname" => "users_post", 
  "responseClass" => "void", 
  "endpoint" => "/users", 
  "notes" => "Post",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


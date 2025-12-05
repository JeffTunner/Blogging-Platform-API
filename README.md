https://roadmap.sh/projects/blogging-platform-api
Blogging Platform API
A RESTful API for a personal blogging platform

Goals
The goals of this project are to help you:

Understand what the RESTful APIs are including best practices and conventions

Learn how to create a RESTful API

Learn about common HTTP methods like GET, POST, PUT, PATCH, DELETE

Learn about status codes and error handling in APIs

Learn how to perform CRUD operations using an API

Learn how to work with databases

Requirements
You should create a RESTful API for a personal blogging platform. The API should allow users to perform the following operations:

Create a new blog post

Update an existing blog post

Delete an existing blog post

Get a single blog post

Get all blog posts

Filter blog posts by a search term

Given below are the details for each API operation.

Create Blog Post
Create a new blog post using the POST method

plaintext

POST /blog/create
{
  "title": "My First Blog Post",
  "content": "This is the content of my first blog post.",
  "category": "Technology",
  "tags": ["Tech", "Programming"]
}
Each blog post should have the following fields:

json

{
  "title": "My First Blog Post",
  "content": "This is the content of my first blog post.",
  "category": "Technology",
  "tags": ["Tech", "Programming"]
}

json

{
  "id": 1,
  "title": "My First Blog Post",
  "content": "This is the content of my first blog post.",
  "category": "Technology",
  "tags": ["Tech", "Programming"],
  "createdAt": "2021-09-01T12:00:00Z",
  "updatedAt": "2021-09-01T12:00:00Z"
}

Update Blog Post
Update an existing blog post using the PUT method

plaintext

PUT /blog/update/1
{
  "title": "My Updated Blog Post",
  "content": "This is the updated content of my first blog post.",
  "category": "Technology",
  "tags": ["Tech", "Programming"]
}

json

{
  "id": 1,
  "title": "My Updated Blog Post",
  "content": "This is the updated content of my first blog post.",
  "category": "Technology",
  "tags": ["Tech", "Programming"],
  "createdAt": "2021-09-01T12:00:00Z",
  "updatedAt": "2021-09-01T12:30:00Z"
}

Delete Blog Post
Delete an existing blog post using the DELETE method

plaintext

DELETE /blog/delete/1
The endpoint should return a 204 No Content status code if the blog post was successfully deleted or a 404 Not Found status code if the blog post was not found.

Get Blog Post
Get a single blog post using the GET method

plaintext

GET /blog/info/1

json

{
  "id": 1,
  "title": "My First Blog Post",
  "content": "This is the content of my first blog post.",
  "category": "Technology",
  "tags": ["Tech", "Programming"],
  "createdAt": "2021-09-01T12:00:00Z",
  "updatedAt": "2021-09-01T12:00:00Z"
}

Get All Blog Posts
Get all blog posts using the GET method

plaintext

GET /blog/all

json

[
  {
    "id": 1,
    "title": "My First Blog Post",
    "content": "This is the content of my first blog post.",
    "category": "Technology",
    "tags": ["Tech", "Programming"],
    "createdAt": "2021-09-01T12:00:00Z",
    "updatedAt": "2021-09-01T12:00:00Z"
  },
  {
    "id": 2,
    "title": "My Second Blog Post",
    "content": "This is the content of my second blog post.",
    "category": "Technology",
    "tags": ["Tech", "Programming"],
    "createdAt": "2021-09-01T12:30:00Z",
    "updatedAt": "2021-09-01T12:30:00Z"
  }
]

While retrieving posts, user can also filter posts by a search term. You should do a wildcard search on the title, content or category fields of the blog posts. For example:

plaintext

GET /blog?term=tech
This should return all blog posts that have the term "tech" in their title, content or category. You can use a simple SQL query if you are using a SQL database or a similar query for a NoSQL database.

Tech Stack
Java + Gradle -> SpringBoot with Database, JPA

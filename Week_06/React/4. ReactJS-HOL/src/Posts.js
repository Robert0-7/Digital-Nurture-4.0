import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: []
    };
  }

  async loadPosts() {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/posts');
      const data = await response.json();
      const postObjects = data.map(post => new Post(post.userId, post.id, post.title, post.body));
      this.setState({ posts: postObjects });
    } catch (error) {
      console.error('Error loading posts:', error);
    }
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert('An error occurred: ' + error);
    console.error('Error Info:', info);
  }

  render() {
    return (
      <div>
        <h2>Blog Posts</h2>
        {this.state.posts.map(post => (
          <div key={post.id}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
            <hr />
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;

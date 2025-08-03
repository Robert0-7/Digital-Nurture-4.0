import React from 'react';
import './App.css';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import { books } from './data/books';

function App() {
  return (
    <div>
      <div>
        <div className="mystyle1">
          <h1>Course Details</h1>
          <CourseDetails />
        </div>
        <div className="st2">
          <h1>Book Details</h1>
          <BookDetails books={books} />
        </div>
        <div className="v1">
          <h1>Blog Details</h1>
          <BlogDetails />
        </div>
      </div>
    </div>
  );
}

export default App;

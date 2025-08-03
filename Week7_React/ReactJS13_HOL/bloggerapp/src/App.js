import logo from './logo.svg';
import './App.css';
import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import { books, courses, blogs } from './components/data';

function App() {
  const [showBooks, setShowBooks] = useState(true);
  const [showBlog, setShowBlog] = useState(true);
  const [showCourses, setShowCourses] = useState(true);
  let bookContent;
  if (showBooks) {
    bookContent = <BookDetails books={books} />;
  } else {
    bookContent = <p>Books not available right now.</p>;
  }
  const blogContent = showBlog ? <BlogDetails blogs={blogs} /> : <p>No blogs to display</p>;
  const courseContent = showCourses && <CourseDetails courses={courses} />;
  return (
    <div className="container">

      <div className="card mystyle1">
        <h2>Course Details</h2>
        {courseContent}
      </div>

      <div className="card mystyle2">
        <h2>Book Details</h2>
        {bookContent}
      </div>

      <div className="card mystyle3">
        <h2>Blog Details</h2>
        {blogContent}
      </div>
      </div>
  );
}

export default App;

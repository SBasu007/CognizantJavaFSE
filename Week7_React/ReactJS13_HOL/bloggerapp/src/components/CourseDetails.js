import React from 'react';

function CourseDetails({ courses }) {
  return (
    <div>
      {courses.map(course => (
        <div key={course.id}>
          <h3>{course.name}</h3>
          <p>{course.startDate}</p>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;
# System Design

## Architecture
This project follows a simple 3-module architecture:
1. **Model Layer** – Student.java  
2. **Service Layer** – StudentService.java  
3. **Application Layer** – Main.java  

## Data Flow
- User selects an action from console menu.
- Main.java forwards operations to StudentService.
- StudentService processes data using an ArrayList.
- Output returns to console.

## Why This Design?
- Very easy to understand.
- Ensures separation of concerns.
- Perfect for basic OOP demonstration.

# Exam Reflection: Java OOP Midterm

## 1. Challenges Faced & Solutions

### Challenge 1: Private Variable Access
**Issue:** Couldn't access `A22.month` due to missing getter methods.  
**Solution:** Initially implemented reflection (`getDeclaredField()`), but later realized this violated encapsulation principles, so I added getter method.

### Challenge 3: Feature Scope Definition
**Issue:** Over-engineered the room service feature with unnecessary attributes like "priority level".  
**Solution:** Simplified to core requirements by reviewing the LMS example and removing non-essential components.

---

## 2. AI Tool Utilization

### Helpful Cases:
| Task | AI Contribution |
|------|-----------------|
| **Switch Statement Formatting** | Generated modern Java 17 switch syntax for month-name conversion |
| **Documentation Templates** | Provided Markdown structure for `ms.md` with proper headers and code blocks |

**Most Valuable Assistance:** AI helped bridge knowledge gaps in JavaDoc formatting through concrete examples.

---

## 3. AI Limitations Encountered

### Case 1: Packages vissualization
**Scenario:** I asked some questions about packages.
**AI Response:** Provided code with wrong package names and imports.
**Resolution:** I manually wrote all imports.

### Case 2: Overcomplication
**Scenario:** Asked for simple availability check method.  
**AI Response:** Suggested implementing `RoomAvailabilityService` interface with multiple abstract methods.  
**Resolution:** I wrote basic new feature in HRS by myself.

---

**Key Takeaways:**  
AI accelerated code prototyping and documentation drafting but required vigilant validation against requirements. Critical thinking remained essential for filtering AI suggestions through problem constraints.

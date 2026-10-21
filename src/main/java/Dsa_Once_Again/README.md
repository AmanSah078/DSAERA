# 🚀 Master Java DSA: Pattern-Oriented Problem Solving & Interview Preparation

[![Language](https://img.shields.io/badge/Language-Java_17+-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com)
[![DSA Grind](https://img.shields.io/badge/DSA-Pattern--Driven_Mastery-4CAF50?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com)
[![SDE Sheet](https://img.shields.io/badge/Curriculum-Striver_A2Z_Sheet-blue?style=for-the-badge)](https://takeuforward.org)
[![Interviews](https://img.shields.io/badge/Company_Rounds-TechRays_|_Tescra_|_Emicon-orange?style=for-the-badge)]()

---

## 📌 Overview

This repository represents my **rigorous, daily, pattern-oriented journey** through Data Structures & Algorithms in Java. Rather than merely memorizing LeetCode solutions, the focus here is on **algorithmic pattern recognition**, dry-run table analyses, and mastering the time-space tradeoffs essential for high-performance software engineering.

> *"Understand the underlying pattern once, solve twenty problems effortlessly."*

---

## 🧭 Repository Architecture (`Dsa_Once_Again`)

The core problem-solving engine resides inside [`src/main/java/Dsa_Once_Again`](src/main/java/Dsa_Once_Again/), categorized into core pattern modules:

```text
src/main/java/
└── Dsa_Once_Again/
    ├── 📂 Array_Pattern_Two_Pointer/        # Left-Right, Fast-Slow pointer paradigms
    ├── 📂 Array_Pattern2_Prefix_Sum/        # Range sum queries, subarray sum equals K
    ├── 📂 Array_Pattern3_Sliding_Window/    # Fixed and dynamic window techniques
    ├── 📂 Array_Pattern4_Kedans_Algorithm/  # Maximum subarray sum & variants
    ├── 📂 Frequency_Array_Pattern_5/        # Frequency counters and hashing without overhead
    ├── 📂 Binary_Search_Problems/           # Peak elements, search in rotated & infinite arrays
    ├── 📂 Hash_Map_Pattern/                 # 2-Sum, longest consecutive sequence, subarray counts
    ├── 📂 String_Problem/                   # Anagrams, string compression, palindromic substrings
    ├── 📂 Recursion_Practice/               # Divide-and-conquer, recursive backtracking
    ├── 📂 Linked_List_ERA/                  # Pointer manipulations and singly/doubly lists
    ├── 📂 StriverSheet_Sunday/              # Deep-dive weekend practice from Striver A2Z SDE Sheet
    ├── 📂 Company_Interview_Questions/      # Actual coding round questions (TechRays, Tescra, Emicon)
    ├── 📂 Daily_Consistency_Routine/        # Disciplined day-by-day revision loop (Mon-Sun)
    └── 📂 Target_50_Questions/              # High-frequency foundational interview problems
```

---

## 🧠 Algorithmic Patterns & Key Problems Solved

| Category | Core Patterns & Techniques | Key Problems Solved | Time Complexity | Space Complexity |
| :--- | :--- | :--- | :--- | :--- |
| **Two Pointers** | Opposite Direction, Dutch National Flag, In-place Swapping | Two Sum II, Reverse Array, Sort 0s and 1s, Sort Even-Odd | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ |
| **Sliding Window** | Fixed Window ($K$), Dynamic Window (Condition-based) | First Negative in Window, Maximum Subarray of Size $K$, Longest Substring Without Repeating Characters | $\mathcal{O}(N)$ | $\mathcal{O}(1) \sim \mathcal{O}(K)$ |
| **Prefix Sum** | Cumulative State Tracking, Hash-Assisted Subarrays | Equilibrium Index, Range Sum Query, Subarrays with Sum $K$ | $\mathcal{O}(N)$ | $\mathcal{O}(1) \sim \mathcal{O}(N)$ |
| **Kadane's Algorithm** | Dynamic Programming on Arrays, Running Sum Reset | Maximum Subarray Sum, Largest Subarray Variations | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ |
| **Binary Search** | Search Space Reduction, Answer Spaces | Ceil & Floor, Peak Element in Mountain Array, Search in Rotated Sorted Array, Infinite Array Search | $\mathcal{O}(\log N)$ | $\mathcal{O}(1)$ |
| **Hashing & Frequencies** | Frequency Maps, HashSets, Lookups | Two Sum, Group Anagrams, Longest Consecutive Sequence, First Non-Repeating Character | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ |
| **Strings** | In-place Pointers, Frequency Buckets | Valid Anagram, Longest Common Prefix, String Compression, Roman to Integer | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ |
| **Recursion** | Base Cases, Call Stack Traversal | Recursive Array Reversal, Fibonacci, Subsets Generation | $\mathcal{O}(2^N) \sim \mathcal{O}(N)$ | $\mathcal{O}(N)$ (stack) |

---

## 🏢 Company-Specific Interview Problems

Dedicated folder [`Company_Interview_Questions`](src/main/java/Dsa_Once_Again/Company_Interview_Questions/) contains interview problem sets solved for top tech screening rounds:

- **TechRays Coding Round:**
  - `TwoSum.java` — Optimized linear scan using Hash indexing.
  - `MaxSumSubArray.java` — Optimized continuous window calculation.
  - `ValidAnagram.java` — Frequency bucket analysis.
  - `NonRepeatingChar.java` — Single-pass hashing.
- **Tescra Technical Round:**
  - `MajorityElement.java` — Boyer-Moore Voting Algorithm.
  - `FindDuplicates.java` & `MoveZeroAtEnd.java` — Two-pointer in-place shifts.
  - `SecondLargest.java` & `PrimeNum.java` — Boundary & math validation.
- **Emicon Evaluation:**
  - `ReverseString.java` & `ReverseArray.java` — Pointer-based manipulation.
  - `PrintUnique.java` & `FreqChar.java` — Frequency tracking.

---

## 📅 The Daily Consistency System (`Daily_Consistency_Routine`)

To eliminate the "learn and forget" trap, this repository implements a **disciplined 7-day cyclical revision routine**:

- 🗓️ **Monday Routine:** Two-pointer & array reversal fundamentals.
- 🗓️ **Tuesday Routine:** Prefix sums & range constraints.
- 🗓️ **Wednesday Routine:** Sliding window & subarray maximums.
- 🗓️ **Thursday Routine:** Binary search edge cases (ceil/floor/rotated).
- 🗓️ **Friday Routine:** HashMaps, frequency counting & string patterns.
- 🗓️ **Saturday Routine:** Multi-concept revision & mixed mock tests.
- 🗓️ **Sunday Deep-Dive:** Striver SDE Sheet comprehensive problem blocks.

---

## 🛠️ How to Run Locally

### Prerequisites
- **JDK 21+** installed
- **Maven** or IDE (IntelliJ IDEA / VS Code)

### Compilation & Execution
Clone the repository and compile any standalone file:

```bash
# Clone the repository
git clone https://github.com/AmanSah078/DSAERA.git
cd DSAERA

# Compile and run any specific pattern problem (e.g. Sliding Window)
javac src/main/java/Dsa_Once_Again/Array_Pattern3_Sliding_Window/Max_subArray_Sum.java
java src/main/java/Dsa_Once_Again/Array_Pattern3_Sliding_Window/Max_subArray_Sum
```

---

## 👤 Author

**Aman Sah**  
Backend & AI Engineer Intern | Java & Spring Boot Specialist | DSA Mentor  
- **GitHub:** [@AmanSah078](https://github.com/AmanSah078)  
- **LinkedIn:** [Aman Sah](https://www.linkedin.com/in/amansah078/)

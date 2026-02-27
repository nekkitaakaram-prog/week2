// 1. State management using let & const (DOM)
let score = 0;
const scoreDisplay = document.getElementById("score");

function increaseScore() {
    score += 1;
    scoreDisplay.textContent = `Score: ${score}`;
}

// 2. Arrow function + Template Literals
const generateReceipt = (price, tip) => {
    const total = price + tip;
    console.log(`The total bill is ₹${total}. Thank you for visiting!`);
};

// 3. Object & Array Destructuring
const participant = {
    name: "Nikki",
    age: 20,
    skills: ["AI", "Web Dev", "Cloud"],
    college: "Vel Tech"
};

const { name, college } = participant;
console.log(name, college);

const [firstSkill, secondSkill] = participant.skills;
console.log(firstSkill, secondSkill);

// 4. Spread & Rest Operators
const collegeFriends = ["Asha", "Rahul"];
const workFriends = ["Kiran", "Suman"];

const partyList = ["Me", ...collegeFriends, ...workFriends];
console.log(partyList);

function invite(host, ...guests) {
    console.log(`Host: ${host}`);
    console.log("Guests:", guests);
}

invite("Nikki", "Asha", "Rahul", "Kiran");
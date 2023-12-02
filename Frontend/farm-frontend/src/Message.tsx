function Message () {
    const name = "Haha";
    if (name)
        return <h1>Hello World {name}</h1>;
    return <h1>Hello</h1>
}

export default Message;
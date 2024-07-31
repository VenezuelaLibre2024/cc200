.class public La2/f;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Ljava/lang/String;

.field public b:[La2/g;


# direct methods
.method public constructor <init>(Ljava/lang/String;[La2/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La2/f;->a:Ljava/lang/String;

    iput-object p2, p0, La2/f;->b:[La2/g;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La2/f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()[La2/g;
    .locals 1

    iget-object v0, p0, La2/f;->b:[La2/g;

    return-object v0
.end method

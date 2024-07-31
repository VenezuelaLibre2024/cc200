.class public Loa/g;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Loa/b;

.field public final b:[Lia/p;


# direct methods
.method public constructor <init>(Loa/b;[Lia/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loa/g;->a:Loa/b;

    iput-object p2, p0, Loa/g;->b:[Lia/p;

    return-void
.end method


# virtual methods
.method public final a()Loa/b;
    .locals 1

    iget-object v0, p0, Loa/g;->a:Loa/b;

    return-object v0
.end method

.method public final b()[Lia/p;
    .locals 1

    iget-object v0, p0, Loa/g;->b:[Lia/p;

    return-object v0
.end method

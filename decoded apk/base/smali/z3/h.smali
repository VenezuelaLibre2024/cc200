.class public final Lz3/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz3/a;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz3/h;->a:Ljava/lang/String;

    return-void
.end method

.method public static a(Lp5/a0;)Lz3/h;
    .locals 2

    new-instance v0, Lz3/h;

    invoke-virtual {p0}, Lp5/a0;->a()I

    move-result v1

    invoke-virtual {p0, v1}, Lp5/a0;->D(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lz3/h;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public getType()I
    .locals 1

    const v0, 0x6e727473

    return v0
.end method

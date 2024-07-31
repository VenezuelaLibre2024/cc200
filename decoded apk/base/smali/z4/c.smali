.class public final Lz4/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz4/g;


# instance fields
.field public final a:Lo5/j$a;


# direct methods
.method public constructor <init>(Lo5/j$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/c;->a:Lo5/j$a;

    return-void
.end method


# virtual methods
.method public a(I)Lo5/j;
    .locals 0

    iget-object p1, p0, Lz4/c;->a:Lo5/j$a;

    invoke-interface {p1}, Lo5/j$a;->a()Lo5/j;

    move-result-object p1

    return-object p1
.end method

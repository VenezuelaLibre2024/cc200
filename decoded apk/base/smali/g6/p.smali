.class public Lg6/p;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg6/p$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lf6/a$b;",
        "L:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lg6/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg6/o<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lg6/x;

.field public final c:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lg6/o;Lg6/x;Ljava/lang/Runnable;Lg6/f1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/p;->a:Lg6/o;

    iput-object p2, p0, Lg6/p;->b:Lg6/x;

    iput-object p3, p0, Lg6/p;->c:Ljava/lang/Runnable;

    return-void
.end method

.method public static a()Lg6/p$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lf6/a$b;",
            "L:Ljava/lang/Object;",
            ">()",
            "Lg6/p$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    new-instance v0, Lg6/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg6/p$a;-><init>(Lg6/e1;)V

    return-object v0
.end method

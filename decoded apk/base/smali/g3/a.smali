.class public final Lg3/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg3/a$f;,
        Lg3/a$b;,
        Lg3/a$c;,
        Lg3/a$d;,
        Lg3/a$g;,
        Lg3/a$a;,
        Lg3/a$e;
    }
.end annotation


# static fields
.field public static final a:Lr8/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg3/a;

    invoke-direct {v0}, Lg3/a;-><init>()V

    sput-object v0, Lg3/a;->a:Lr8/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lr8/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr8/b<",
            "*>;)V"
        }
    .end annotation

    const-class v0, Lg3/m;

    sget-object v1, Lg3/a$e;->a:Lg3/a$e;

    invoke-interface {p1, v0, v1}, Lr8/b;->a(Ljava/lang/Class;Lq8/e;)Lr8/b;

    const-class v0, Lj3/a;

    sget-object v1, Lg3/a$a;->a:Lg3/a$a;

    invoke-interface {p1, v0, v1}, Lr8/b;->a(Ljava/lang/Class;Lq8/e;)Lr8/b;

    const-class v0, Lj3/f;

    sget-object v1, Lg3/a$g;->a:Lg3/a$g;

    invoke-interface {p1, v0, v1}, Lr8/b;->a(Ljava/lang/Class;Lq8/e;)Lr8/b;

    const-class v0, Lj3/d;

    sget-object v1, Lg3/a$d;->a:Lg3/a$d;

    invoke-interface {p1, v0, v1}, Lr8/b;->a(Ljava/lang/Class;Lq8/e;)Lr8/b;

    const-class v0, Lj3/c;

    sget-object v1, Lg3/a$c;->a:Lg3/a$c;

    invoke-interface {p1, v0, v1}, Lr8/b;->a(Ljava/lang/Class;Lq8/e;)Lr8/b;

    const-class v0, Lj3/b;

    sget-object v1, Lg3/a$b;->a:Lg3/a$b;

    invoke-interface {p1, v0, v1}, Lr8/b;->a(Ljava/lang/Class;Lq8/e;)Lr8/b;

    const-class v0, Lj3/e;

    sget-object v1, Lg3/a$f;->a:Lg3/a$f;

    invoke-interface {p1, v0, v1}, Lr8/b;->a(Ljava/lang/Class;Lq8/e;)Lr8/b;

    return-void
.end method

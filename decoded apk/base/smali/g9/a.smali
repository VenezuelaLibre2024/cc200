.class public final Lg9/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg9/a$a;,
        Lg9/a$b;,
        Lg9/a$c;
    }
.end annotation


# static fields
.field public static final a:Lr8/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg9/a;

    invoke-direct {v0}, Lg9/a;-><init>()V

    sput-object v0, Lg9/a;->a:Lr8/a;

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

    const-class v0, Lg9/i0;

    sget-object v1, Lg9/a$c;->a:Lg9/a$c;

    invoke-interface {p1, v0, v1}, Lr8/b;->a(Ljava/lang/Class;Lq8/e;)Lr8/b;

    const-class v0, Lh9/b;

    sget-object v1, Lg9/a$b;->a:Lg9/a$b;

    invoke-interface {p1, v0, v1}, Lr8/b;->a(Ljava/lang/Class;Lq8/e;)Lr8/b;

    const-class v0, Lh9/a;

    sget-object v1, Lg9/a$a;->a:Lg9/a$a;

    invoke-interface {p1, v0, v1}, Lr8/b;->a(Ljava/lang/Class;Lq8/e;)Lr8/b;

    return-void
.end method

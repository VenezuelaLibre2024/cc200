.class public final Lf8/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/a$a;
    }
.end annotation


# static fields
.field public static final a:Lr8/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf8/a;

    invoke-direct {v0}, Lf8/a;-><init>()V

    sput-object v0, Lf8/a;->a:Lr8/a;

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

    const-class v0, Lf8/i;

    sget-object v1, Lf8/a$a;->a:Lf8/a$a;

    invoke-interface {p1, v0, v1}, Lr8/b;->a(Ljava/lang/Class;Lq8/e;)Lr8/b;

    const-class v0, Lf8/b;

    invoke-interface {p1, v0, v1}, Lr8/b;->a(Ljava/lang/Class;Lq8/e;)Lr8/b;

    return-void
.end method

.class public final Lf3/b$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq8/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq8/e<",
        "Lf3/o;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lf3/b$f;

.field public static final b:Lq8/d;

.field public static final c:Lq8/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf3/b$f;

    invoke-direct {v0}, Lf3/b$f;-><init>()V

    sput-object v0, Lf3/b$f;->a:Lf3/b$f;

    const-string v0, "networkType"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$f;->b:Lq8/d;

    const-string v0, "mobileSubtype"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$f;->c:Lq8/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lf3/o;

    check-cast p2, Lq8/f;

    invoke-virtual {p0, p1, p2}, Lf3/b$f;->b(Lf3/o;Lq8/f;)V

    return-void
.end method

.method public b(Lf3/o;Lq8/f;)V
    .locals 2

    sget-object v0, Lf3/b$f;->b:Lq8/d;

    invoke-virtual {p1}, Lf3/o;->c()Lf3/o$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lf3/b$f;->c:Lq8/d;

    invoke-virtual {p1}, Lf3/o;->b()Lf3/o$b;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    return-void
.end method

.class public final Lg8/a$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq8/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq8/e<",
        "Lg8/f0$e$a$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lg8/a$h;

.field public static final b:Lq8/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg8/a$h;

    invoke-direct {v0}, Lg8/a$h;-><init>()V

    sput-object v0, Lg8/a$h;->a:Lg8/a$h;

    const-string v0, "clsId"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$h;->b:Lq8/d;

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

    check-cast p1, Lg8/f0$e$a$b;

    check-cast p2, Lq8/f;

    invoke-virtual {p0, p1, p2}, Lg8/a$h;->b(Lg8/f0$e$a$b;Lq8/f;)V

    return-void
.end method

.method public b(Lg8/f0$e$a$b;Lq8/f;)V
    .locals 1

    sget-object v0, Lg8/a$h;->b:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$a$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    return-void
.end method

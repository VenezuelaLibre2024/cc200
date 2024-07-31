.class public final Lg3/a$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq8/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq8/e<",
        "Lg3/m;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lg3/a$e;

.field public static final b:Lq8/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg3/a$e;

    invoke-direct {v0}, Lg3/a$e;-><init>()V

    sput-object v0, Lg3/a$e;->a:Lg3/a$e;

    const-string v0, "clientMetrics"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg3/a$e;->b:Lq8/d;

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

    check-cast p1, Lg3/m;

    check-cast p2, Lq8/f;

    invoke-virtual {p0, p1, p2}, Lg3/a$e;->b(Lg3/m;Lq8/f;)V

    return-void
.end method

.method public b(Lg3/m;Lq8/f;)V
    .locals 1

    sget-object v0, Lg3/a$e;->b:Lq8/d;

    invoke-virtual {p1}, Lg3/m;->b()Lj3/a;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    return-void
.end method

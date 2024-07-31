.class public final Lm9/c$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq8/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq8/e<",
        "Lm9/z;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lm9/c$e;

.field public static final b:Lq8/d;

.field public static final c:Lq8/d;

.field public static final d:Lq8/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm9/c$e;

    invoke-direct {v0}, Lm9/c$e;-><init>()V

    sput-object v0, Lm9/c$e;->a:Lm9/c$e;

    const-string v0, "eventType"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lm9/c$e;->b:Lq8/d;

    const-string v0, "sessionData"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lm9/c$e;->c:Lq8/d;

    const-string v0, "applicationInfo"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lm9/c$e;->d:Lq8/d;

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

    check-cast p1, Lm9/z;

    check-cast p2, Lq8/f;

    invoke-virtual {p0, p1, p2}, Lm9/c$e;->b(Lm9/z;Lq8/f;)V

    return-void
.end method

.method public b(Lm9/z;Lq8/f;)V
    .locals 2

    sget-object v0, Lm9/c$e;->b:Lq8/d;

    invoke-virtual {p1}, Lm9/z;->b()Lm9/i;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lm9/c$e;->c:Lq8/d;

    invoke-virtual {p1}, Lm9/z;->c()Lm9/e0;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lm9/c$e;->d:Lq8/d;

    invoke-virtual {p1}, Lm9/z;->a()Lm9/b;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    return-void
.end method

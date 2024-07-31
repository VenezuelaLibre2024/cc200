.class public final Lm9/c$d;
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
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq8/e<",
        "Lm9/t;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lm9/c$d;

.field public static final b:Lq8/d;

.field public static final c:Lq8/d;

.field public static final d:Lq8/d;

.field public static final e:Lq8/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm9/c$d;

    invoke-direct {v0}, Lm9/c$d;-><init>()V

    sput-object v0, Lm9/c$d;->a:Lm9/c$d;

    const-string v0, "processName"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lm9/c$d;->b:Lq8/d;

    const-string v0, "pid"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lm9/c$d;->c:Lq8/d;

    const-string v0, "importance"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lm9/c$d;->d:Lq8/d;

    const-string v0, "defaultProcess"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lm9/c$d;->e:Lq8/d;

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

    check-cast p1, Lm9/t;

    check-cast p2, Lq8/f;

    invoke-virtual {p0, p1, p2}, Lm9/c$d;->b(Lm9/t;Lq8/f;)V

    return-void
.end method

.method public b(Lm9/t;Lq8/f;)V
    .locals 2

    sget-object v0, Lm9/c$d;->b:Lq8/d;

    invoke-virtual {p1}, Lm9/t;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lm9/c$d;->c:Lq8/d;

    invoke-virtual {p1}, Lm9/t;->b()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lq8/f;->a(Lq8/d;I)Lq8/f;

    sget-object v0, Lm9/c$d;->d:Lq8/d;

    invoke-virtual {p1}, Lm9/t;->a()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lq8/f;->a(Lq8/d;I)Lq8/f;

    sget-object v0, Lm9/c$d;->e:Lq8/d;

    invoke-virtual {p1}, Lm9/t;->d()Z

    move-result p1

    invoke-interface {p2, v0, p1}, Lq8/f;->g(Lq8/d;Z)Lq8/f;

    return-void
.end method

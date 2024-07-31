.class public final Lm9/k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm9/k$b;
    }
.end annotation


# static fields
.field public static final c:Lm9/k$b;


# instance fields
.field public final a:Ln7/g;

.field public final b:Lo9/f;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm9/k$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm9/k$b;-><init>(Ltd/g;)V

    sput-object v0, Lm9/k;->c:Lm9/k$b;

    return-void
.end method

.method public constructor <init>(Ln7/g;Lo9/f;Ljd/g;)V
    .locals 6

    const-string v0, "firebaseApp"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settings"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundDispatcher"

    invoke-static {p3, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/k;->a:Ln7/g;

    iput-object p2, p0, Lm9/k;->b:Lo9/f;

    const-string p2, "FirebaseSessions"

    const-string v0, "Initializing Firebase Sessions SDK."

    invoke-static {p2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Ln7/g;->m()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    instance-of v0, p1, Landroid/app/Application;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/app/Application;

    sget-object p2, Lm9/i0;->h:Lm9/i0;

    invoke-virtual {p1, p2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    invoke-static {p3}, Lce/q0;->a(Ljd/g;)Lce/p0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lm9/k$a;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p3, p1}, Lm9/k$a;-><init>(Lm9/k;Ljd/g;Ljd/d;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lce/i;->d(Lce/p0;Ljd/g;Lce/r0;Lsd/p;ILjava/lang/Object;)Lce/c2;

    goto :goto_0

    :cond_0
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed to register lifecycle callbacks, unexpected context "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public static final synthetic a(Lm9/k;)Ln7/g;
    .locals 0

    iget-object p0, p0, Lm9/k;->a:Ln7/g;

    return-object p0
.end method

.method public static final synthetic b(Lm9/k;)Lo9/f;
    .locals 0

    iget-object p0, p0, Lm9/k;->b:Lo9/f;

    return-object p0
.end method

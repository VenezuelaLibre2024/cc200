.class public final synthetic Lg9/v0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ljava/util/concurrent/ScheduledExecutorService;

.field public final synthetic c:Lcom/google/firebase/messaging/FirebaseMessaging;

.field public final synthetic d:Lg9/h0;

.field public final synthetic e:Lg9/d0;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/firebase/messaging/FirebaseMessaging;Lg9/h0;Lg9/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/v0;->a:Landroid/content/Context;

    iput-object p2, p0, Lg9/v0;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, Lg9/v0;->c:Lcom/google/firebase/messaging/FirebaseMessaging;

    iput-object p4, p0, Lg9/v0;->d:Lg9/h0;

    iput-object p5, p0, Lg9/v0;->e:Lg9/d0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lg9/v0;->a:Landroid/content/Context;

    iget-object v1, p0, Lg9/v0;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v2, p0, Lg9/v0;->c:Lcom/google/firebase/messaging/FirebaseMessaging;

    iget-object v3, p0, Lg9/v0;->d:Lg9/h0;

    iget-object v4, p0, Lg9/v0;->e:Lg9/d0;

    invoke-static {v0, v1, v2, v3, v4}, Lg9/w0;->a(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/firebase/messaging/FirebaseMessaging;Lg9/h0;Lg9/d0;)Lg9/w0;

    move-result-object v0

    return-object v0
.end method

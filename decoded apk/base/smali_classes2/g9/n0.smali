.class public final synthetic Lg9/n0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:Lcom/google/firebase/messaging/e;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/e;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/n0;->a:Lcom/google/firebase/messaging/e;

    iput-object p2, p0, Lg9/n0;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lg9/n0;->a:Lcom/google/firebase/messaging/e;

    iget-object v1, p0, Lg9/n0;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/google/firebase/messaging/e;->a(Lcom/google/firebase/messaging/e;Ljava/lang/String;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

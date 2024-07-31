.class public final synthetic Lw8/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final a:Lcom/google/firebase/iid/a;

.field public final b:Landroid/util/Pair;


# direct methods
.method public constructor <init>(Lcom/google/firebase/iid/a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/r;->a:Lcom/google/firebase/iid/a;

    iput-object p2, p0, Lw8/r;->b:Landroid/util/Pair;

    return-void
.end method


# virtual methods
.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lw8/r;->a:Lcom/google/firebase/iid/a;

    iget-object v1, p0, Lw8/r;->b:Landroid/util/Pair;

    invoke-virtual {v0, v1, p1}, Lcom/google/firebase/iid/a;->b(Landroid/util/Pair;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    return-object p1
.end method

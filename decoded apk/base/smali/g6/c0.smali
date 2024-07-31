.class public final Lg6/c0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lg6/b;

.field public final b:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public constructor <init>(Lg6/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iput-object v0, p0, Lg6/c0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p1, p0, Lg6/c0;->a:Lg6/b;

    return-void
.end method


# virtual methods
.method public final a()Lg6/b;
    .locals 1

    iget-object v0, p0, Lg6/c0;->a:Lg6/b;

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/tasks/TaskCompletionSource;
    .locals 1

    iget-object v0, p0, Lg6/c0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-object v0
.end method

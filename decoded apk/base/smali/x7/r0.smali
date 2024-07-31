.class public final synthetic Lx7/r0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public synthetic a:Lcom/google/firebase/auth/internal/RecaptchaActivity;

.field public synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/auth/internal/RecaptchaActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx7/r0;->a:Lcom/google/firebase/auth/internal/RecaptchaActivity;

    iput-object p2, p0, Lx7/r0;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, Lx7/r0;->a:Lcom/google/firebase/auth/internal/RecaptchaActivity;

    iget-object v1, p0, Lx7/r0;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/google/firebase/auth/internal/RecaptchaActivity;->k(Ljava/lang/String;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

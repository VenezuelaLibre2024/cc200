.class public abstract Lcom/google/firebase/auth/b$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/auth/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# static fields
.field private static final zza:Lk6/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lk6/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "PhoneAuthProvider"

    invoke-direct {v0, v2, v1}, Lk6/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/auth/b$b;->zza:Lk6/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCodeAutoRetrievalTimeOut(Ljava/lang/String;)V
    .locals 2

    sget-object p1, Lcom/google/firebase/auth/b$b;->zza:Lk6/a;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Sms auto retrieval timed-out."

    invoke-virtual {p1, v1, v0}, Lk6/a;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onCodeSent(Ljava/lang/String;Lcom/google/firebase/auth/b$a;)V
    .locals 0

    return-void
.end method

.method public abstract onVerificationCompleted(Lw7/o0;)V
.end method

.method public abstract onVerificationFailed(Ln7/m;)V
.end method

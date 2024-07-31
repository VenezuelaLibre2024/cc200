.class public final synthetic Lw8/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/iid/a$a;


# instance fields
.field public final a:Lcom/google/firebase/iid/FirebaseInstanceId;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Lcom/google/firebase/iid/b$a;


# direct methods
.method public constructor <init>(Lcom/google/firebase/iid/FirebaseInstanceId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/iid/b$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/f;->a:Lcom/google/firebase/iid/FirebaseInstanceId;

    iput-object p2, p0, Lw8/f;->b:Ljava/lang/String;

    iput-object p3, p0, Lw8/f;->c:Ljava/lang/String;

    iput-object p4, p0, Lw8/f;->d:Ljava/lang/String;

    iput-object p5, p0, Lw8/f;->e:Lcom/google/firebase/iid/b$a;

    return-void
.end method


# virtual methods
.method public start()Lcom/google/android/gms/tasks/Task;
    .locals 5

    iget-object v0, p0, Lw8/f;->a:Lcom/google/firebase/iid/FirebaseInstanceId;

    iget-object v1, p0, Lw8/f;->b:Ljava/lang/String;

    iget-object v2, p0, Lw8/f;->c:Ljava/lang/String;

    iget-object v3, p0, Lw8/f;->d:Ljava/lang/String;

    iget-object v4, p0, Lw8/f;->e:Lcom/google/firebase/iid/b$a;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/firebase/iid/FirebaseInstanceId;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/iid/b$a;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

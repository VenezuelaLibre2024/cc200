.class public final Lcom/google/firebase/auth/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/auth/a$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/google/firebase/auth/FirebaseAuth;

.field public b:Ljava/lang/Long;

.field public c:Lcom/google/firebase/auth/b$b;

.field public d:Ljava/util/concurrent/Executor;

.field public e:Ljava/lang/String;

.field public f:Landroid/app/Activity;

.field public g:Lcom/google/firebase/auth/b$a;

.field public h:Lw7/l0;

.field public i:Lw7/r0;

.field public j:Z

.field public k:Z


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/Long;Lcom/google/firebase/auth/b$b;Ljava/util/concurrent/Executor;Ljava/lang/String;Landroid/app/Activity;Lcom/google/firebase/auth/b$a;Lw7/l0;Lw7/r0;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/auth/a;->a:Lcom/google/firebase/auth/FirebaseAuth;

    iput-object p5, p0, Lcom/google/firebase/auth/a;->e:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/firebase/auth/a;->b:Ljava/lang/Long;

    iput-object p3, p0, Lcom/google/firebase/auth/a;->c:Lcom/google/firebase/auth/b$b;

    iput-object p6, p0, Lcom/google/firebase/auth/a;->f:Landroid/app/Activity;

    iput-object p4, p0, Lcom/google/firebase/auth/a;->d:Ljava/util/concurrent/Executor;

    iput-object p7, p0, Lcom/google/firebase/auth/a;->g:Lcom/google/firebase/auth/b$a;

    iput-object p8, p0, Lcom/google/firebase/auth/a;->h:Lw7/l0;

    iput-object p9, p0, Lcom/google/firebase/auth/a;->i:Lw7/r0;

    iput-boolean p10, p0, Lcom/google/firebase/auth/a;->j:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/Long;Lcom/google/firebase/auth/b$b;Ljava/util/concurrent/Executor;Ljava/lang/String;Landroid/app/Activity;Lcom/google/firebase/auth/b$a;Lw7/l0;Lw7/r0;ZLw7/r1;)V
    .locals 0

    invoke-direct/range {p0 .. p10}, Lcom/google/firebase/auth/a;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/Long;Lcom/google/firebase/auth/b$b;Ljava/util/concurrent/Executor;Ljava/lang/String;Landroid/app/Activity;Lcom/google/firebase/auth/b$a;Lw7/l0;Lw7/r0;Z)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/a;->f:Landroid/app/Activity;

    return-object v0
.end method

.method public final b(Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/firebase/auth/a;->k:Z

    return-void
.end method

.method public final c()Lcom/google/firebase/auth/FirebaseAuth;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/a;->a:Lcom/google/firebase/auth/FirebaseAuth;

    return-object v0
.end method

.method public final d()Lw7/l0;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/a;->h:Lw7/l0;

    return-object v0
.end method

.method public final e()Lcom/google/firebase/auth/b$a;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/a;->g:Lcom/google/firebase/auth/b$a;

    return-object v0
.end method

.method public final f()Lcom/google/firebase/auth/b$b;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/a;->c:Lcom/google/firebase/auth/b$b;

    return-object v0
.end method

.method public final g()Lw7/r0;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/a;->i:Lw7/r0;

    return-object v0
.end method

.method public final h()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/a;->b:Ljava/lang/Long;

    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/a;->d:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/firebase/auth/a;->k:Z

    return v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/firebase/auth/a;->j:Z

    return v0
.end method

.method public final m()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/a;->h:Lw7/l0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

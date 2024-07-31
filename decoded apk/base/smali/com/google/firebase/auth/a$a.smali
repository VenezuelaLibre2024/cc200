.class public final Lcom/google/firebase/auth/a$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/auth/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/google/firebase/auth/FirebaseAuth;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/Long;

.field public d:Lcom/google/firebase/auth/b$b;

.field public e:Ljava/util/concurrent/Executor;

.field public f:Landroid/app/Activity;

.field public g:Lcom/google/firebase/auth/b$a;

.field public h:Lw7/l0;

.field public i:Lw7/r0;

.field public j:Z


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/FirebaseAuth;

    iput-object p1, p0, Lcom/google/firebase/auth/a$a;->a:Lcom/google/firebase/auth/FirebaseAuth;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/firebase/auth/a;
    .locals 14

    iget-object v0, p0, Lcom/google/firebase/auth/a$a;->a:Lcom/google/firebase/auth/FirebaseAuth;

    const-string v1, "FirebaseAuth instance cannot be null"

    invoke-static {v0, v1}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/a$a;->c:Ljava/lang/Long;

    const-string v1, "You must specify an auto-retrieval timeout; please call #setTimeout()"

    invoke-static {v0, v1}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/a$a;->d:Lcom/google/firebase/auth/b$b;

    const-string v1, "You must specify callbacks on your PhoneAuthOptions. Please call #setCallbacks()"

    invoke-static {v0, v1}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/a$a;->a:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseAuth;->E0()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/auth/a$a;->e:Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lcom/google/firebase/auth/a$a;->c:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_8

    iget-object v0, p0, Lcom/google/firebase/auth/a$a;->c:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x78

    cmp-long v0, v0, v2

    if-gtz v0, :cond_8

    iget-object v0, p0, Lcom/google/firebase/auth/a$a;->h:Lw7/l0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    const-string v4, "A phoneMultiFactorInfo must be set for second factor sign-in."

    if-eqz v3, :cond_2

    iget-object v0, p0, Lcom/google/firebase/auth/a$a;->b:Ljava/lang/String;

    const-string v3, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()"

    invoke-static {v0, v3}, Lh6/s;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    iget-boolean v0, p0, Lcom/google/firebase/auth/a$a;->j:Z

    xor-int/2addr v0, v2

    const-string v3, "You cannot require sms validation without setting a multi-factor session."

    invoke-static {v0, v3}, Lh6/s;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/firebase/auth/a$a;->i:Lw7/r0;

    if-nez v0, :cond_1

    move v1, v2

    :cond_1
    invoke-static {v1, v4}, Lh6/s;->b(ZLjava/lang/Object;)V

    goto :goto_4

    :cond_2
    if-eqz v0, :cond_3

    check-cast v0, Lx7/p;

    invoke-virtual {v0}, Lx7/p;->M()Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v2

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/firebase/auth/a$a;->b:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/auth/a$a;->i:Lw7/r0;

    if-nez v0, :cond_4

    move v1, v2

    :cond_4
    const-string v0, "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session."

    :goto_2
    invoke-static {v1, v0}, Lh6/s;->b(ZLjava/lang/Object;)V

    goto :goto_4

    :cond_5
    iget-object v0, p0, Lcom/google/firebase/auth/a$a;->i:Lw7/r0;

    if-eqz v0, :cond_6

    move v0, v2

    goto :goto_3

    :cond_6
    move v0, v1

    :goto_3
    invoke-static {v0, v4}, Lh6/s;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/firebase/auth/a$a;->b:Ljava/lang/String;

    if-nez v0, :cond_7

    move v1, v2

    :cond_7
    const-string v0, "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead."

    goto :goto_2

    :goto_4
    new-instance v0, Lcom/google/firebase/auth/a;

    iget-object v3, p0, Lcom/google/firebase/auth/a$a;->a:Lcom/google/firebase/auth/FirebaseAuth;

    iget-object v4, p0, Lcom/google/firebase/auth/a$a;->c:Ljava/lang/Long;

    iget-object v5, p0, Lcom/google/firebase/auth/a$a;->d:Lcom/google/firebase/auth/b$b;

    iget-object v6, p0, Lcom/google/firebase/auth/a$a;->e:Ljava/util/concurrent/Executor;

    iget-object v7, p0, Lcom/google/firebase/auth/a$a;->b:Ljava/lang/String;

    iget-object v8, p0, Lcom/google/firebase/auth/a$a;->f:Landroid/app/Activity;

    iget-object v9, p0, Lcom/google/firebase/auth/a$a;->g:Lcom/google/firebase/auth/b$a;

    iget-object v10, p0, Lcom/google/firebase/auth/a$a;->h:Lw7/l0;

    iget-object v11, p0, Lcom/google/firebase/auth/a$a;->i:Lw7/r0;

    iget-boolean v12, p0, Lcom/google/firebase/auth/a$a;->j:Z

    const/4 v13, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v13}, Lcom/google/firebase/auth/a;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/Long;Lcom/google/firebase/auth/b$b;Ljava/util/concurrent/Executor;Ljava/lang/String;Landroid/app/Activity;Lcom/google/firebase/auth/b$a;Lw7/l0;Lw7/r0;ZLw7/r1;)V

    return-object v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "We only support 0-120 seconds for sms-auto-retrieval timeout"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Landroid/app/Activity;)Lcom/google/firebase/auth/a$a;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/a$a;->f:Landroid/app/Activity;

    return-object p0
.end method

.method public final c(Lcom/google/firebase/auth/b$b;)Lcom/google/firebase/auth/a$a;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/a$a;->d:Lcom/google/firebase/auth/b$b;

    return-object p0
.end method

.method public final d(Lcom/google/firebase/auth/b$a;)Lcom/google/firebase/auth/a$a;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/a$a;->g:Lcom/google/firebase/auth/b$a;

    return-object p0
.end method

.method public final e(Lw7/r0;)Lcom/google/firebase/auth/a$a;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/a$a;->i:Lw7/r0;

    return-object p0
.end method

.method public final f(Lw7/l0;)Lcom/google/firebase/auth/a$a;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/a$a;->h:Lw7/l0;

    return-object p0
.end method

.method public final g(Ljava/lang/String;)Lcom/google/firebase/auth/a$a;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/a$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final h(Ljava/lang/Long;Ljava/util/concurrent/TimeUnit;)Lcom/google/firebase/auth/a$a;
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/auth/a$a;->c:Ljava/lang/Long;

    return-object p0
.end method

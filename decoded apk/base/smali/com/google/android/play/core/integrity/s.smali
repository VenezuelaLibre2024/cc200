.class final Lcom/google/android/play/core/integrity/s;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/play/core/integrity/s;

.field private final b:Lg7/m;

.field private final c:Lg7/m;

.field private final d:Lg7/m;

.field private final e:Lg7/m;

.field private final f:Lg7/m;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/google/android/play/core/integrity/r;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/google/android/play/core/integrity/s;->a:Lcom/google/android/play/core/integrity/s;

    invoke-static {p1}, Lg7/k;->b(Ljava/lang/Object;)Lg7/j;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/play/core/integrity/s;->b:Lg7/m;

    invoke-static {}, Lcom/google/android/play/core/integrity/an;->a()Lcom/google/android/play/core/integrity/ao;

    move-result-object p2

    invoke-static {p2}, Lg7/i;->b(Lg7/m;)Lg7/m;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/play/core/integrity/s;->c:Lg7/m;

    new-instance v0, Lcom/google/android/play/core/integrity/az;

    invoke-direct {v0, p1, p2}, Lcom/google/android/play/core/integrity/az;-><init>(Lg7/m;Lg7/m;)V

    invoke-static {v0}, Lg7/i;->b(Lg7/m;)Lg7/m;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/play/core/integrity/s;->d:Lg7/m;

    new-instance p2, Lcom/google/android/play/core/integrity/be;

    invoke-direct {p2, p1}, Lcom/google/android/play/core/integrity/be;-><init>(Lg7/m;)V

    invoke-static {p2}, Lg7/i;->b(Lg7/m;)Lg7/m;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/play/core/integrity/s;->e:Lg7/m;

    new-instance v0, Lcom/google/android/play/core/integrity/am;

    invoke-direct {v0, p1, p2}, Lcom/google/android/play/core/integrity/am;-><init>(Lg7/m;Lg7/m;)V

    invoke-static {v0}, Lg7/i;->b(Lg7/m;)Lg7/m;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/play/core/integrity/s;->f:Lg7/m;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/play/core/integrity/StandardIntegrityManager;
    .locals 1

    iget-object v0, p0, Lcom/google/android/play/core/integrity/s;->f:Lg7/m;

    invoke-interface {v0}, Lg7/m;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/play/core/integrity/StandardIntegrityManager;

    return-object v0
.end method

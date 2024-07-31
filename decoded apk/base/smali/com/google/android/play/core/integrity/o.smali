.class final Lcom/google/android/play/core/integrity/o;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/play/core/integrity/o;

.field private final b:Lg7/m;

.field private final c:Lg7/m;

.field private final d:Lg7/m;

.field private final e:Lg7/m;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/google/android/play/core/integrity/n;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/google/android/play/core/integrity/o;->a:Lcom/google/android/play/core/integrity/o;

    invoke-static {p1}, Lg7/k;->b(Ljava/lang/Object;)Lg7/j;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/play/core/integrity/o;->b:Lg7/m;

    invoke-static {}, Lcom/google/android/play/core/integrity/y;->a()Lcom/google/android/play/core/integrity/z;

    move-result-object p2

    invoke-static {p2}, Lg7/i;->b(Lg7/m;)Lg7/m;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/play/core/integrity/o;->c:Lg7/m;

    new-instance v0, Lcom/google/android/play/core/integrity/af;

    invoke-direct {v0, p1, p2}, Lcom/google/android/play/core/integrity/af;-><init>(Lg7/m;Lg7/m;)V

    invoke-static {v0}, Lg7/i;->b(Lg7/m;)Lg7/m;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/play/core/integrity/o;->d:Lg7/m;

    new-instance p2, Lcom/google/android/play/core/integrity/x;

    invoke-direct {p2, p1}, Lcom/google/android/play/core/integrity/x;-><init>(Lg7/m;)V

    invoke-static {p2}, Lg7/i;->b(Lg7/m;)Lg7/m;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/play/core/integrity/o;->e:Lg7/m;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/play/core/integrity/IntegrityManager;
    .locals 1

    iget-object v0, p0, Lcom/google/android/play/core/integrity/o;->e:Lg7/m;

    invoke-interface {v0}, Lg7/m;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/play/core/integrity/IntegrityManager;

    return-object v0
.end method

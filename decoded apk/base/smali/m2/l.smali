.class public Lm2/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc2/f;


# static fields
.field public static final d:Ljava/lang/String;


# instance fields
.field public final a:Lo2/a;

.field public final b:Lk2/a;

.field public final c:Ll2/q;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "WMFgUpdater"

    invoke-static {v0}, Lc2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lm2/l;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;Lk2/a;Lo2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lm2/l;->b:Lk2/a;

    iput-object p3, p0, Lm2/l;->a:Lo2/a;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->B()Ll2/q;

    move-result-object p1

    iput-object p1, p0, Lm2/l;->c:Ll2/q;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/util/UUID;Lc2/e;)Ll7/f;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/UUID;",
            "Lc2/e;",
            ")",
            "Ll7/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ln2/c;->t()Ln2/c;

    move-result-object v6

    iget-object v7, p0, Lm2/l;->a:Lo2/a;

    new-instance v8, Lm2/l$a;

    move-object v0, v8

    move-object v1, p0

    move-object v2, v6

    move-object v3, p2

    move-object v4, p3

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lm2/l$a;-><init>(Lm2/l;Ln2/c;Ljava/util/UUID;Lc2/e;Landroid/content/Context;)V

    invoke-interface {v7, v8}, Lo2/a;->b(Ljava/lang/Runnable;)V

    return-object v6
.end method

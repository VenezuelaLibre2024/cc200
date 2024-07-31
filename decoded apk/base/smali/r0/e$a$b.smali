.class public final Lr0/e$a$b;
.super Lld/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr0/e$a;->c(Ljava/util/List;Lr0/i;Ljd/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lld/d;"
    }
.end annotation

.annotation runtime Lld/f;
    c = "androidx.datastore.core.DataMigrationInitializer$Companion"
    f = "DataMigrationInitializer.kt"
    l = {
        0x2a,
        0x39
    }
    m = "runMigrations"
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lr0/e$a;

.field public l:I


# direct methods
.method public constructor <init>(Lr0/e$a;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr0/e$a;",
            "Ljd/d<",
            "-",
            "Lr0/e$a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lr0/e$a$b;->k:Lr0/e$a;

    invoke-direct {p0, p2}, Lld/d;-><init>(Ljd/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lr0/e$a$b;->j:Ljava/lang/Object;

    iget p1, p0, Lr0/e$a$b;->l:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lr0/e$a$b;->l:I

    iget-object p1, p0, Lr0/e$a$b;->k:Lr0/e$a;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lr0/e$a;->a(Lr0/e$a;Ljava/util/List;Lr0/i;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

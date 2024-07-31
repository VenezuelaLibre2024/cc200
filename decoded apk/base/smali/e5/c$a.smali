.class public final Le5/c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final c:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Le5/c$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ld5/b;

.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Le5/b;->h:Le5/b;

    sput-object v0, Le5/c$a;->c:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;FIIFIFZII)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ld5/b$b;

    invoke-direct {v0}, Ld5/b$b;-><init>()V

    invoke-virtual {v0, p1}, Ld5/b$b;->o(Ljava/lang/CharSequence;)Ld5/b$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Ld5/b$b;->p(Landroid/text/Layout$Alignment;)Ld5/b$b;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Ld5/b$b;->h(FI)Ld5/b$b;

    move-result-object p1

    invoke-virtual {p1, p5}, Ld5/b$b;->i(I)Ld5/b$b;

    move-result-object p1

    invoke-virtual {p1, p6}, Ld5/b$b;->k(F)Ld5/b$b;

    move-result-object p1

    invoke-virtual {p1, p7}, Ld5/b$b;->l(I)Ld5/b$b;

    move-result-object p1

    invoke-virtual {p1, p8}, Ld5/b$b;->n(F)Ld5/b$b;

    move-result-object p1

    if-eqz p9, :cond_0

    invoke-virtual {p1, p10}, Ld5/b$b;->s(I)Ld5/b$b;

    :cond_0
    invoke-virtual {p1}, Ld5/b$b;->a()Ld5/b;

    move-result-object p1

    iput-object p1, p0, Le5/c$a;->a:Ld5/b;

    iput p11, p0, Le5/c$a;->b:I

    return-void
.end method

.method public static synthetic a(Le5/c$a;Le5/c$a;)I
    .locals 0

    invoke-static {p0, p1}, Le5/c$a;->c(Le5/c$a;Le5/c$a;)I

    move-result p0

    return p0
.end method

.method public static synthetic b()Ljava/util/Comparator;
    .locals 1

    sget-object v0, Le5/c$a;->c:Ljava/util/Comparator;

    return-object v0
.end method

.method public static synthetic c(Le5/c$a;Le5/c$a;)I
    .locals 0

    iget p1, p1, Le5/c$a;->b:I

    iget p0, p0, Le5/c$a;->b:I

    invoke-static {p1, p0}, Ljava/lang/Integer;->compare(II)I

    move-result p0

    return p0
.end method

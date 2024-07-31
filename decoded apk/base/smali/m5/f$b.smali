.class public Lm5/f$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm5/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final c:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lm5/f$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lm5/f$c;

.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lm5/g;->h:Lm5/g;

    sput-object v0, Lm5/f$b;->c:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Lm5/f$c;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm5/f$b;->a:Lm5/f$c;

    iput p2, p0, Lm5/f$b;->b:I

    return-void
.end method

.method public synthetic constructor <init>(Lm5/f$c;ILm5/f$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lm5/f$b;-><init>(Lm5/f$c;I)V

    return-void
.end method

.method public static synthetic a(Lm5/f$b;Lm5/f$b;)I
    .locals 0

    invoke-static {p0, p1}, Lm5/f$b;->e(Lm5/f$b;Lm5/f$b;)I

    move-result p0

    return p0
.end method

.method public static synthetic b()Ljava/util/Comparator;
    .locals 1

    sget-object v0, Lm5/f$b;->c:Ljava/util/Comparator;

    return-object v0
.end method

.method public static synthetic c(Lm5/f$b;)Lm5/f$c;
    .locals 0

    iget-object p0, p0, Lm5/f$b;->a:Lm5/f$c;

    return-object p0
.end method

.method public static synthetic d(Lm5/f$b;)I
    .locals 0

    iget p0, p0, Lm5/f$b;->b:I

    return p0
.end method

.method public static synthetic e(Lm5/f$b;Lm5/f$b;)I
    .locals 0

    iget-object p0, p0, Lm5/f$b;->a:Lm5/f$c;

    iget p0, p0, Lm5/f$c;->b:I

    iget-object p1, p1, Lm5/f$b;->a:Lm5/f$c;

    iget p1, p1, Lm5/f$c;->b:I

    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p0

    return p0
.end method

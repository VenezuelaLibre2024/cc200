.class public abstract Landroidx/emoji2/text/e$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# instance fields
.field public final a:Landroidx/emoji2/text/e$g;

.field public b:Z

.field public c:Z

.field public d:[I

.field public e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/emoji2/text/e$e;",
            ">;"
        }
    .end annotation
.end field

.field public f:Z

.field public g:I

.field public h:I

.field public i:Landroidx/emoji2/text/e$d;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/e$g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, -0xff0100

    iput v0, p0, Landroidx/emoji2/text/e$c;->g:I

    const/4 v0, 0x0

    iput v0, p0, Landroidx/emoji2/text/e$c;->h:I

    new-instance v0, Landroidx/emoji2/text/d;

    invoke-direct {v0}, Landroidx/emoji2/text/d;-><init>()V

    iput-object v0, p0, Landroidx/emoji2/text/e$c;->i:Landroidx/emoji2/text/e$d;

    const-string v0, "metadataLoader cannot be null."

    invoke-static {p1, v0}, Lj0/d;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Landroidx/emoji2/text/e$c;->a:Landroidx/emoji2/text/e$g;

    return-void
.end method


# virtual methods
.method public final a()Landroidx/emoji2/text/e$g;
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/e$c;->a:Landroidx/emoji2/text/e$g;

    return-object v0
.end method

.method public b(I)Landroidx/emoji2/text/e$c;
    .locals 0

    iput p1, p0, Landroidx/emoji2/text/e$c;->h:I

    return-object p0
.end method

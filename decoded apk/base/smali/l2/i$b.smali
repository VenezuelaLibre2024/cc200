.class public Ll2/i$b;
.super Lo1/k;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll2/i;-><init>(Lo1/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:Ll2/i;


# direct methods
.method public constructor <init>(Ll2/i;Lo1/e;)V
    .locals 0

    iput-object p1, p0, Ll2/i$b;->d:Ll2/i;

    invoke-direct {p0, p2}, Lo1/k;-><init>(Lo1/e;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM SystemIdInfo where work_spec_id=?"

    return-object v0
.end method
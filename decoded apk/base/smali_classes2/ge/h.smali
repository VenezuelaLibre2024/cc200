.class public final Lge/h;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lhe/l0;

.field public static final b:Lhe/l0;

.field public static final c:Lhe/l0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhe/l0;

    const-string v1, "NULL"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lge/h;->a:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "UNINITIALIZED"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lge/h;->b:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "DONE"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lge/h;->c:Lhe/l0;

    return-void
.end method

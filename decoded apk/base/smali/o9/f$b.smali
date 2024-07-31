.class public final Lo9/f$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo9/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final synthetic a:[Lyd/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lyd/h<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x1

    new-array v0, v0, [Lyd/h;

    new-instance v1, Ltd/s;

    const-class v2, Lo9/f$b;

    const-string v3, "dataStore"

    const-string v4, "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Ltd/s;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Ltd/x;->e(Ltd/r;)Lyd/g;

    move-result-object v1

    aput-object v1, v0, v5

    sput-object v0, Lo9/f$b;->a:[Lyd/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltd/g;)V
    .locals 0

    invoke-direct {p0}, Lo9/f$b;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lo9/f$b;Landroid/content/Context;)Lr0/f;
    .locals 0

    invoke-virtual {p0, p1}, Lo9/f$b;->b(Landroid/content/Context;)Lr0/f;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Landroid/content/Context;)Lr0/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lr0/f<",
            "Lu0/d;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lo9/f;->a()Lud/a;

    move-result-object v0

    sget-object v1, Lo9/f$b;->a:[Lyd/h;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p1, v1}, Lud/a;->a(Ljava/lang/Object;Lyd/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr0/f;

    return-object p1
.end method

.method public final c()Lo9/f;
    .locals 2

    sget-object v0, Ln7/c;->a:Ln7/c;

    invoke-static {v0}, Ln7/n;->a(Ln7/c;)Ln7/g;

    move-result-object v0

    const-class v1, Lo9/f;

    invoke-virtual {v0, v1}, Ln7/g;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Firebase.app[SessionsSettings::class.java]"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lo9/f;

    return-object v0
.end method

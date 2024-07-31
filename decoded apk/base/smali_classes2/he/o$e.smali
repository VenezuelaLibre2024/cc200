.class public final Lhe/o$e;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhe/o;->b(Ljava/lang/Class;)Lsd/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# static fields
.field public static final h:Lhe/o$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhe/o$e;

    invoke-direct {v0}, Lhe/o$e;-><init>()V

    sput-object v0, Lhe/o$e;->h:Lhe/o$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Ljava/lang/Void;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lhe/o$e;->a(Ljava/lang/Throwable;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

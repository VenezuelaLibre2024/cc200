.class public final Lhe/c;
.super Lhe/j;
.source ""


# annotations
.annotation build Lorg/codehaus/mojo/animal_sniffer/IgnoreJRERequirement;
.end annotation


# static fields
.field public static final a:Lhe/c;

.field public static final b:Lhe/c$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhe/c;

    invoke-direct {v0}, Lhe/c;-><init>()V

    sput-object v0, Lhe/c;->a:Lhe/c;

    new-instance v0, Lhe/c$a;

    invoke-direct {v0}, Lhe/c$a;-><init>()V

    sput-object v0, Lhe/c;->b:Lhe/c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lhe/j;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lsd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lsd/l<",
            "Ljava/lang/Throwable;",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    sget-object v0, Lhe/c;->b:Lhe/c$a;

    invoke-virtual {v0, p1}, Ljava/lang/ClassValue;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lsd/l;

    return-object p1
.end method

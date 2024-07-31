.class public final Lc7/rc;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc7/rc;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final A:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final B:Ljava/lang/String;

.field public final C:Ljava/lang/String;

.field public final D:Ljava/lang/String;

.field public final E:Ljava/lang/String;

.field public final F:Z

.field public final G:J

.field public final H:I

.field public final I:Ljava/lang/String;

.field public final J:I

.field public final K:J

.field public final L:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:J

.field public final m:J

.field public final n:Ljava/lang/String;

.field public final o:Z

.field public final p:Z

.field public final q:J

.field public final r:Ljava/lang/String;

.field public final s:J
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final t:J

.field public final u:I

.field public final v:Z

.field public final w:Z

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/Boolean;

.field public final z:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc7/jc;

    invoke-direct {v0}, Lc7/jc;-><init>()V

    sput-object v0, Lc7/rc;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "JJ",
            "Ljava/lang/String;",
            "ZZ",
            "Ljava/lang/String;",
            "JJIZZ",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZJI",
            "Ljava/lang/String;",
            "IJ",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct {p0}, Li6/a;-><init>()V

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    move-object v1, p1

    iput-object v1, v0, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object v1, p2

    :goto_0
    iput-object v1, v0, Lc7/rc;->i:Ljava/lang/String;

    move-object v1, p3

    iput-object v1, v0, Lc7/rc;->j:Ljava/lang/String;

    move-wide v3, p4

    iput-wide v3, v0, Lc7/rc;->q:J

    move-object v1, p6

    iput-object v1, v0, Lc7/rc;->k:Ljava/lang/String;

    move-wide v3, p7

    iput-wide v3, v0, Lc7/rc;->l:J

    move-wide v3, p9

    iput-wide v3, v0, Lc7/rc;->m:J

    move-object/from16 v1, p11

    iput-object v1, v0, Lc7/rc;->n:Ljava/lang/String;

    move/from16 v1, p12

    iput-boolean v1, v0, Lc7/rc;->o:Z

    move/from16 v1, p13

    iput-boolean v1, v0, Lc7/rc;->p:Z

    move-object/from16 v1, p14

    iput-object v1, v0, Lc7/rc;->r:Ljava/lang/String;

    move-wide/from16 v3, p15

    iput-wide v3, v0, Lc7/rc;->s:J

    move-wide/from16 v3, p17

    iput-wide v3, v0, Lc7/rc;->t:J

    move/from16 v1, p19

    iput v1, v0, Lc7/rc;->u:I

    move/from16 v1, p20

    iput-boolean v1, v0, Lc7/rc;->v:Z

    move/from16 v1, p21

    iput-boolean v1, v0, Lc7/rc;->w:Z

    move-object/from16 v1, p22

    iput-object v1, v0, Lc7/rc;->x:Ljava/lang/String;

    move-object/from16 v1, p23

    iput-object v1, v0, Lc7/rc;->y:Ljava/lang/Boolean;

    move-wide/from16 v3, p24

    iput-wide v3, v0, Lc7/rc;->z:J

    move-object/from16 v1, p26

    iput-object v1, v0, Lc7/rc;->A:Ljava/util/List;

    iput-object v2, v0, Lc7/rc;->B:Ljava/lang/String;

    move-object/from16 v1, p28

    iput-object v1, v0, Lc7/rc;->C:Ljava/lang/String;

    move-object/from16 v1, p29

    iput-object v1, v0, Lc7/rc;->D:Ljava/lang/String;

    move-object/from16 v1, p30

    iput-object v1, v0, Lc7/rc;->E:Ljava/lang/String;

    move/from16 v1, p31

    iput-boolean v1, v0, Lc7/rc;->F:Z

    move-wide/from16 v1, p32

    iput-wide v1, v0, Lc7/rc;->G:J

    move/from16 v1, p34

    iput v1, v0, Lc7/rc;->H:I

    move-object/from16 v1, p35

    iput-object v1, v0, Lc7/rc;->I:Ljava/lang/String;

    move/from16 v1, p36

    iput v1, v0, Lc7/rc;->J:I

    move-wide/from16 v1, p37

    iput-wide v1, v0, Lc7/rc;->K:J

    move-object/from16 v1, p39

    iput-object v1, v0, Lc7/rc;->L:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;ZZJLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJ",
            "Ljava/lang/String;",
            "ZZJ",
            "Ljava/lang/String;",
            "JJIZZ",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZJI",
            "Ljava/lang/String;",
            "IJ",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct {p0}, Li6/a;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lc7/rc;->h:Ljava/lang/String;

    move-object v1, p2

    iput-object v1, v0, Lc7/rc;->i:Ljava/lang/String;

    move-object v1, p3

    iput-object v1, v0, Lc7/rc;->j:Ljava/lang/String;

    move-wide v1, p12

    iput-wide v1, v0, Lc7/rc;->q:J

    move-object v1, p4

    iput-object v1, v0, Lc7/rc;->k:Ljava/lang/String;

    move-wide v1, p5

    iput-wide v1, v0, Lc7/rc;->l:J

    move-wide v1, p7

    iput-wide v1, v0, Lc7/rc;->m:J

    move-object v1, p9

    iput-object v1, v0, Lc7/rc;->n:Ljava/lang/String;

    move v1, p10

    iput-boolean v1, v0, Lc7/rc;->o:Z

    move v1, p11

    iput-boolean v1, v0, Lc7/rc;->p:Z

    move-object/from16 v1, p14

    iput-object v1, v0, Lc7/rc;->r:Ljava/lang/String;

    move-wide/from16 v1, p15

    iput-wide v1, v0, Lc7/rc;->s:J

    move-wide/from16 v1, p17

    iput-wide v1, v0, Lc7/rc;->t:J

    move/from16 v1, p19

    iput v1, v0, Lc7/rc;->u:I

    move/from16 v1, p20

    iput-boolean v1, v0, Lc7/rc;->v:Z

    move/from16 v1, p21

    iput-boolean v1, v0, Lc7/rc;->w:Z

    move-object/from16 v1, p22

    iput-object v1, v0, Lc7/rc;->x:Ljava/lang/String;

    move-object/from16 v1, p23

    iput-object v1, v0, Lc7/rc;->y:Ljava/lang/Boolean;

    move-wide/from16 v1, p24

    iput-wide v1, v0, Lc7/rc;->z:J

    move-object/from16 v1, p26

    iput-object v1, v0, Lc7/rc;->A:Ljava/util/List;

    move-object/from16 v1, p27

    iput-object v1, v0, Lc7/rc;->B:Ljava/lang/String;

    move-object/from16 v1, p28

    iput-object v1, v0, Lc7/rc;->C:Ljava/lang/String;

    move-object/from16 v1, p29

    iput-object v1, v0, Lc7/rc;->D:Ljava/lang/String;

    move-object/from16 v1, p30

    iput-object v1, v0, Lc7/rc;->E:Ljava/lang/String;

    move/from16 v1, p31

    iput-boolean v1, v0, Lc7/rc;->F:Z

    move-wide/from16 v1, p32

    iput-wide v1, v0, Lc7/rc;->G:J

    move/from16 v1, p34

    iput v1, v0, Lc7/rc;->H:I

    move-object/from16 v1, p35

    iput-object v1, v0, Lc7/rc;->I:Ljava/lang/String;

    move/from16 v1, p36

    iput v1, v0, Lc7/rc;->J:I

    move-wide/from16 v1, p37

    iput-wide v1, v0, Lc7/rc;->K:J

    move-object/from16 v1, p39

    iput-object v1, v0, Lc7/rc;->L:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lc7/rc;->h:Ljava/lang/String;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lc7/rc;->i:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lc7/rc;->j:Ljava/lang/String;

    const/4 v1, 0x4

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lc7/rc;->k:Ljava/lang/String;

    const/4 v1, 0x5

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-wide v0, p0, Lc7/rc;->l:J

    const/4 v3, 0x6

    invoke-static {p1, v3, v0, v1}, Li6/c;->y(Landroid/os/Parcel;IJ)V

    iget-wide v0, p0, Lc7/rc;->m:J

    const/4 v3, 0x7

    invoke-static {p1, v3, v0, v1}, Li6/c;->y(Landroid/os/Parcel;IJ)V

    iget-object v0, p0, Lc7/rc;->n:Ljava/lang/String;

    const/16 v1, 0x8

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-boolean v0, p0, Lc7/rc;->o:Z

    const/16 v1, 0x9

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget-boolean v0, p0, Lc7/rc;->p:Z

    const/16 v1, 0xa

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget-wide v0, p0, Lc7/rc;->q:J

    const/16 v3, 0xb

    invoke-static {p1, v3, v0, v1}, Li6/c;->y(Landroid/os/Parcel;IJ)V

    iget-object v0, p0, Lc7/rc;->r:Ljava/lang/String;

    const/16 v1, 0xc

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-wide v0, p0, Lc7/rc;->s:J

    const/16 v3, 0xd

    invoke-static {p1, v3, v0, v1}, Li6/c;->y(Landroid/os/Parcel;IJ)V

    iget-wide v0, p0, Lc7/rc;->t:J

    const/16 v3, 0xe

    invoke-static {p1, v3, v0, v1}, Li6/c;->y(Landroid/os/Parcel;IJ)V

    iget v0, p0, Lc7/rc;->u:I

    const/16 v1, 0xf

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Lc7/rc;->v:Z

    const/16 v1, 0x10

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget-boolean v0, p0, Lc7/rc;->w:Z

    const/16 v1, 0x12

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Lc7/rc;->x:Ljava/lang/String;

    const/16 v1, 0x13

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lc7/rc;->y:Ljava/lang/Boolean;

    const/16 v1, 0x15

    invoke-static {p1, v1, v0, v2}, Li6/c;->i(Landroid/os/Parcel;ILjava/lang/Boolean;Z)V

    iget-wide v0, p0, Lc7/rc;->z:J

    const/16 v3, 0x16

    invoke-static {p1, v3, v0, v1}, Li6/c;->y(Landroid/os/Parcel;IJ)V

    iget-object v0, p0, Lc7/rc;->A:Ljava/util/List;

    const/16 v1, 0x17

    invoke-static {p1, v1, v0, v2}, Li6/c;->H(Landroid/os/Parcel;ILjava/util/List;Z)V

    iget-object v0, p0, Lc7/rc;->B:Ljava/lang/String;

    const/16 v1, 0x18

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lc7/rc;->C:Ljava/lang/String;

    const/16 v1, 0x19

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lc7/rc;->D:Ljava/lang/String;

    const/16 v1, 0x1a

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lc7/rc;->E:Ljava/lang/String;

    const/16 v1, 0x1b

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-boolean v0, p0, Lc7/rc;->F:Z

    const/16 v1, 0x1c

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget-wide v0, p0, Lc7/rc;->G:J

    const/16 v3, 0x1d

    invoke-static {p1, v3, v0, v1}, Li6/c;->y(Landroid/os/Parcel;IJ)V

    iget v0, p0, Lc7/rc;->H:I

    const/16 v1, 0x1e

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget-object v0, p0, Lc7/rc;->I:Ljava/lang/String;

    const/16 v1, 0x1f

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget v0, p0, Lc7/rc;->J:I

    const/16 v1, 0x20

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget-wide v0, p0, Lc7/rc;->K:J

    const/16 v3, 0x22

    invoke-static {p1, v3, v0, v1}, Li6/c;->y(Landroid/os/Parcel;IJ)V

    iget-object v0, p0, Lc7/rc;->L:Ljava/lang/String;

    const/16 v1, 0x23

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

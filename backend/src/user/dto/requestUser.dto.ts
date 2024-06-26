import { ApiProperty } from '@nestjs/swagger';
import { IsEnum, isFirebasePushId, IsNotEmpty, IsString } from 'class-validator';
import { Nationality } from '../../enums/nationality.enum';
import { User } from '../../interfaces/user.interface';

export class RequestUserDTO implements User {
  @ApiProperty()
  @IsNotEmpty()
  @IsString()
  userName: string;

  @ApiProperty()
  @IsNotEmpty()
  @IsEnum(Nationality)
  nationality: Nationality;

  @ApiProperty()
  @IsNotEmpty()
  @IsString()
  firebaseId: string;
}

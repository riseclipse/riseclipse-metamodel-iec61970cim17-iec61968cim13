/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CogenerationPlantItemProvider extends PowerSystemResourceItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CogenerationPlantItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addCogenHPSendoutRatingPropertyDescriptor( object );
            addCogenHPSteamRatingPropertyDescriptor( object );
            addCogenLPSendoutRatingPropertyDescriptor( object );
            addCogenLPSteamRatingPropertyDescriptor( object );
            addRatedPPropertyDescriptor( object );
            addThermalGeneratingUnitsPropertyDescriptor( object );
            addSteamSendoutSchedulePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Cogen HP Sendout Rating feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCogenHPSendoutRatingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CogenerationPlant_cogenHPSendoutRating_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_CogenerationPlant_cogenHPSendoutRating_feature", "_UI_CogenerationPlant_type" ),
                        CimPackage.eINSTANCE.getCogenerationPlant_CogenHPSendoutRating(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Cogen HP Steam Rating feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCogenHPSteamRatingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CogenerationPlant_cogenHPSteamRating_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_CogenerationPlant_cogenHPSteamRating_feature", "_UI_CogenerationPlant_type" ),
                        CimPackage.eINSTANCE.getCogenerationPlant_CogenHPSteamRating(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Cogen LP Sendout Rating feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCogenLPSendoutRatingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CogenerationPlant_cogenLPSendoutRating_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_CogenerationPlant_cogenLPSendoutRating_feature", "_UI_CogenerationPlant_type" ),
                        CimPackage.eINSTANCE.getCogenerationPlant_CogenLPSendoutRating(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Cogen LP Steam Rating feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCogenLPSteamRatingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CogenerationPlant_cogenLPSteamRating_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_CogenerationPlant_cogenLPSteamRating_feature", "_UI_CogenerationPlant_type" ),
                        CimPackage.eINSTANCE.getCogenerationPlant_CogenLPSteamRating(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rated P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CogenerationPlant_ratedP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CogenerationPlant_ratedP_feature",
                                "_UI_CogenerationPlant_type" ),
                        CimPackage.eINSTANCE.getCogenerationPlant_RatedP(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Thermal Generating Units feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThermalGeneratingUnitsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CogenerationPlant_ThermalGeneratingUnits_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_CogenerationPlant_ThermalGeneratingUnits_feature", "_UI_CogenerationPlant_type" ),
                        CimPackage.eINSTANCE.getCogenerationPlant_ThermalGeneratingUnits(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Steam Sendout Schedule feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSteamSendoutSchedulePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_CogenerationPlant_SteamSendoutSchedule_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_CogenerationPlant_SteamSendoutSchedule_feature", "_UI_CogenerationPlant_type" ),
                        CimPackage.eINSTANCE.getCogenerationPlant_SteamSendoutSchedule(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns CogenerationPlant.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/CogenerationPlant" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( CogenerationPlant ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_CogenerationPlant_type" )
                : getString( "_UI_CogenerationPlant_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( CogenerationPlant.class ) ) {
        case CimPackage.COGENERATION_PLANT__COGEN_HP_SENDOUT_RATING:
        case CimPackage.COGENERATION_PLANT__COGEN_HP_STEAM_RATING:
        case CimPackage.COGENERATION_PLANT__COGEN_LP_SENDOUT_RATING:
        case CimPackage.COGENERATION_PLANT__COGEN_LP_STEAM_RATING:
        case CimPackage.COGENERATION_PLANT__RATED_P:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
